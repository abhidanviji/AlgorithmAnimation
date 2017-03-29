package mysort;

import java.util.concurrent.Semaphore;

class SortType implements Runnable {
	String name;
	private Double[] values, tempMergArr;
	private DisplayPattern component;
	private Semaphore gate;
	private int length;
	private static final int DELAY = 100, VALUES_LENGTH = 60;
	private volatile boolean run;

	public SortType(DisplayPattern comp, String name) {
		this.name = name;
		values = new Double[VALUES_LENGTH];
		for (int i = 0; i < values.length; i++)
			values[i] = new Double(Math.random());
		this.component = comp;
		this.gate = new Semaphore(1);
		this.run = false;
	}

	public void setRun() {
		run = true;
		gate.release();
	}

	public void run() {
		if (name == "BubbleSort-Bar-Vertical" || name == "BubbleSort-Line-Horizontal" || name == "BubbleSortBarHoriz"
				|| name == "BubbleSort-Line-Vertical" || name == "BubbleSort-Cir-Vertical"
				|| name == "BubbleSort-Cir-Horizontal" || name == "BubbleSort-Dot") {
			for (int i = values.length; --i >= 0;) {
				for (int j = 0; j < i; j++) {
					if (values[j] > values[j + 1]) {
						double temp = values[j + 1];
						values[j + 1] = values[j];
						values[j] = temp;
						component.setValues(values, values[j], values[j + 1]);
						try {
							if (run)
								Thread.sleep(DELAY);
							else
								gate.acquire();
						} catch (InterruptedException exception) {
							Thread.currentThread().interrupt();
						}
					}

				}

			}
		}
		if (name == "QuickSort-Bar-Vertical" || name == "QuickSort-Line-Horizontal" || name == "QuickSortBarHorz"
				|| name == "QuickSort-Line-Vertical" || name == "QuickSort-Cir-Vertical"
				|| name == "QuickSort-Cir-Horizontal" || name == "QuickSort-Dot") {
			for (int i = 0; i < values.length - 1; i++) {
				int index = i;
				for (int j = i + 1; j < values.length; j++)
					if (values[j] < values[index]) {
						index = j;
					}
				Double smallerNumber = values[index];
				values[index] = values[i];
				values[i] = smallerNumber;
				component.setValues(values, values[i], values[index]);
				try {
					if (run)
						Thread.sleep(DELAY);
					else
						gate.acquire();
				} catch (InterruptedException exception) {
					Thread.currentThread().interrupt();
				}
			}
		}
		if (name == "InsertSort-Bar-Vertical" || name == "InsertSort-Line-Horizontal" || name == "InsertSortBarHoriz"
				|| name == "InsertSort-Line-Vertical" || name == "InsertSort-Cir-Vertical"
				|| name == "InsertSort-Cir-Horizontal" || name == "InsertSort-Dot") {
			double temp;
			for (int i = 1; i < values.length; i++) {
				for (int j = i; j > 0; j--) {
					if (values[j] < values[j - 1]) {
						temp = values[j];
						values[j] = values[j - 1];
						values[j - 1] = temp;
						component.setValues(values, values[i], values[j]);
						try {
							if (run)
								Thread.sleep(DELAY);
							else
								gate.acquire();
						} catch (InterruptedException exception) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		}
		if (name == "MergeSort-Bar-Vertical" || name == "MergeSort-Line-Horizontal" || name == "MergeSortBarHoriz"
				|| name == "MergeSort-Line-Vertical" || name == "MergeSort-Cir-Vertical"
				|| name == "MergeSort-Cir-Horizontal" || name == "MergeSort-Dot") {
			this.length = values.length;
			this.tempMergArr = new Double[length];
			doMergeSort(0, length - 1);
		}

	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);

			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);

			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);

		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = values[i];

		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				values[k] = tempMergArr[i];
				component.setValues(values, values[i], values[k]);
				i++;
				try {
					if (run)
						Thread.sleep(DELAY);
					else
						gate.acquire();
				} catch (InterruptedException exception) {
					Thread.currentThread().interrupt();
				}

			} else {
				values[k] = tempMergArr[j];
				component.setValues(values, values[j], values[k]);
				j++;
				try {
					if (run)
						Thread.sleep(DELAY);
					else
						gate.acquire();
				} catch (InterruptedException exception) {
					Thread.currentThread().interrupt();
				}

			}

			k++;
		}
		while (i <= middle) {
			values[k] = tempMergArr[i];
			component.setValues(values, values[i], values[k]);
			k++;
			i++;
			try {
				if (run)
					Thread.sleep(DELAY);
				else
					gate.acquire();
			} catch (InterruptedException exception) {
				Thread.currentThread().interrupt();
			}
		}

	}
}
