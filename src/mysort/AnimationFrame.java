package mysort;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class AnimationFrame extends JFrame {
	private int DEFAULT_WIDTH = 180;
	private int DEFAULT_HEIGHT = 200;

	public AnimationFrame(String name) {

		if (name == "BubbleSort-Bar-Vertical") {
			DEFAULT_WIDTH = 200;
			DEFAULT_HEIGHT = 200;
			DisplayPattern comp = new DisplayPattern("BubbleSort-Bar-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Bar-Vertical");

			JButton runButton = new JButton("BubbleSort-Bar-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSort-Bar-Vertical") {
			DEFAULT_WIDTH = 200;
			DEFAULT_HEIGHT = 200;
			DisplayPattern comp = new DisplayPattern("QuickSort-Bar-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Bar-Vertical");

			JButton runButton = new JButton("SelectionSort-Bar-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {

					sorter.setRun();

				}
			});

			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();

		}
		if (name == "QuickSort-Line-Horizontal") {
			DisplayPattern comp = new DisplayPattern("QuickSort-Line-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Line-Horizontal");

			JButton runButton = new JButton("SelectionSort-Line-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});

			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "BubbleSort-Line-Horizontal") {
			DisplayPattern comp = new DisplayPattern("BubbleSort-Line-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Line-Horizontal");

			JButton runButton = new JButton("BubbleSort-Line-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});

			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "BubbleSort-Line-Vertical") {
			DisplayPattern comp = new DisplayPattern("BubbleSort-Line-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Line-Vertical");

			JButton runButton = new JButton("BubbleSort-Line-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSort-Line-Vertical") {
			DisplayPattern comp = new DisplayPattern("QuickSort-Line-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Line-Vertical");

			JButton runButton = new JButton("SelectionSort-Line-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "BubbleSortBarHoriz") {
			DisplayPattern comp = new DisplayPattern("BubbleSortBarHoriz");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSortBarHoriz");

			JButton runButton = new JButton("BubbleSort-Bar-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSortBarHorz") {
			DisplayPattern comp = new DisplayPattern("QuickSortBarHorz");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSortBarHorz");

			JButton runButton = new JButton("SelectionSort-Bar-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {

					sorter.setRun();

				}
			});

			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}

		if (name == "BubbleSort-Cir-Horizontal") {
			DisplayPattern comp = new DisplayPattern("BubbleSort-Cir-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Cir-Horizontal");

			JButton runButton = new JButton("BubbleSort-Cir-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSort-Cir-Horizontal") {
			DisplayPattern comp = new DisplayPattern("QuickSort-Cir-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Cir-Horizontal");

			JButton runButton = new JButton("SelectionSort-Cir-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "BubbleSort-Cir-Vertical") {
			DisplayPattern comp = new DisplayPattern("BubbleSort-Cir-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Cir-Vertical");

			JButton runButton = new JButton("BubbleSort-Cir-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "BubbleSort-Dot") {
			DisplayPattern comp = new DisplayPattern("BubbleSort-Dot");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "BubbleSort-Dot");

			JButton runButton = new JButton("BubbleSort-Dot");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSort-Cir-Vertical") {
			DisplayPattern comp = new DisplayPattern("QuickSort-Cir-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Cir-Vertical");

			JButton runButton = new JButton("SelectionSort-Cir-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "QuickSort-Dot") {
			DisplayPattern comp = new DisplayPattern("QuickSort-Dot");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "QuickSort-Dot");

			JButton runButton = new JButton("SelectionSort-Dot");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Bar-Vertical") {
			DEFAULT_WIDTH = 200;
			DEFAULT_HEIGHT = 200;
			DisplayPattern comp = new DisplayPattern("InsertSort-Bar-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Bar-Vertical");

			JButton runButton = new JButton("InsertSort-Bar-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}

		if (name == "InsertSortBarHoriz") {
			DisplayPattern comp = new DisplayPattern("InsertSortBarHoriz");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSortBarHoriz");

			JButton runButton = new JButton("InsertSort-Bar-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Line-Horizontal") {
			DisplayPattern comp = new DisplayPattern("InsertSort-Line-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Line-Horizontal");

			JButton runButton = new JButton("InsertSort-Line-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Line-Vertical") {
			DisplayPattern comp = new DisplayPattern("InsertSort-Line-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Line-Vertical");

			JButton runButton = new JButton("InsertSort-Line-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Cir-Vertical") {
			DisplayPattern comp = new DisplayPattern("InsertSort-Cir-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Cir-Vertical");

			JButton runButton = new JButton("InsertSort-Cir-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Cir-Horizontal") {
			DisplayPattern comp = new DisplayPattern("InsertSort-Cir-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Cir-Horizontal");

			JButton runButton = new JButton("InsertSort-Cir-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "InsertSort-Dot") {
			DisplayPattern comp = new DisplayPattern("InsertSort-Dot");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "InsertSort-Dot");

			JButton runButton = new JButton("InsertSort-Dot");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Bar-Vertical") {
			DEFAULT_WIDTH = 200;
			DEFAULT_HEIGHT = 200;
			DisplayPattern comp = new DisplayPattern("MergeSort-Bar-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Bar-Vertical");

			JButton runButton = new JButton("MergeSort-Bar-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}

		if (name == "MergeSortBarHoriz") {
			DisplayPattern comp = new DisplayPattern("MergeSortBarHoriz");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSortBarHoriz");

			JButton runButton = new JButton("MergeSort-Bar-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Line-Horizontal") {
			DisplayPattern comp = new DisplayPattern("MergeSort-Line-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Line-Horizontal");

			JButton runButton = new JButton("MergeSort-Line-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Line-Vertical") {
			DisplayPattern comp = new DisplayPattern("MergeSort-Line-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Line-Vertical");

			JButton runButton = new JButton("MergeSort-Line-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Cir-Vertical") {
			DisplayPattern comp = new DisplayPattern("MergeSort-Cir-Vertical");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Cir-Vertical");

			JButton runButton = new JButton("MergeSort-Cir-Vertical");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Cir-Horizontal") {
			DisplayPattern comp = new DisplayPattern("MergeSort-Cir-Horizontal");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Cir-Horizontal");

			JButton runButton = new JButton("MergeSort-Cir-Horizontal");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}
		if (name == "MergeSort-Dot") {
			DisplayPattern comp = new DisplayPattern("MergeSort-Dot");
			add(comp, BorderLayout.CENTER);

			final SortType sorter = new SortType(comp, "MergeSort-Dot");

			JButton runButton = new JButton("MergeSort-Dot");
			runButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sorter.setRun();
				}
			});
			JPanel buttons = new JPanel();
			buttons.add(runButton);
			add(buttons, BorderLayout.NORTH);
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

			Thread t = new Thread(sorter);
			t.start();
		}

	}

}
