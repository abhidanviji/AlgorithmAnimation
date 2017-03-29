package mysort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

class DisplayPattern extends JComponent {
	String name;
	int height;
	int width;
	private Double marked1;
	private Double marked2;
	private Double[] values;

	public DisplayPattern(String name) {
		this.name = name;
	}

	public synchronized void setValues(Double[] values, Double marked1, Double marked2) {
		this.values = values.clone();
		this.marked1 = marked1;
		this.marked2 = marked2;
		repaint();
	}

	public synchronized void paintComponent(Graphics g) {
		if (name == "BubbleSort-Bar-Vertical" || name == "QuickSort-Bar-Vertical" || name == "InsertSort-Bar-Vertical"
				|| name == "MergeSort-Bar-Vertical") {
			if (values == null)
				return;
			Graphics2D g2 = (Graphics2D) g;
			int width = getWidth() / values.length;
			for (int i = 0; i < values.length; i++) {
				double height = values[i] * getHeight();
				Rectangle2D bar = new Rectangle2D.Double(width * i, 0, width, height);
				if (values[i] == marked1 || values[i] == marked2)
					g2.fill(bar);
				else
					g2.draw(bar);
			}
		}
		if (name == "BubbleSortBarHoriz" || name == "QuickSortBarHorz" || name == "InsertSortBarHoriz"
				|| name == "MergeSortBarHoriz") {
			if (values == null)
				return;
			Graphics2D g2 = (Graphics2D) g;
			int width = getWidth() / values.length;
			for (int i = 0; i < values.length; i++) {
				double height = values[i] * getHeight();
				Rectangle2D bar = new Rectangle2D.Double(0, width * i, height, width);
				if (values[i] == marked1 || values[i] == marked2)
					g2.fill(bar);
				else
					g2.draw(bar);
			}
		}
		if (name == "QuickSort-Line-Horizontal" || name == "BubbleSort-Line-Horizontal"
				|| name == "InsertSort-Line-Horizontal" || name == "MergeSort-Line-Horizontal") {
			height = getHeight();
			width = getWidth();

			g.setColor(Color.black);
			int y = height;
			double f = width;/// (double) values.length;
			for (int i = values.length; --i >= 0; y -= 2) {
				if (values[i] == marked1 || values[i] == marked2) {
					g.setColor(Color.RED);
					g.drawLine(0, y, (int) (values[i] * f), y);
				} else {
					g.setColor(Color.black);
					g.drawLine(0, y, (int) (values[i] * f), y);
				}
			}
		}

		if (name == "BubbleSort-Line-Vertical" || name == "QuickSort-Line-Vertical"
				|| name == "InsertSort-Line-Vertical" || name == "MergeSort-Line-Vertical") {
			height = getHeight();
			width = getWidth();

			int x = width;
			double f = height;/// (double) values.length;
			g.setColor(Color.black);
			for (int i = values.length; --i >= 0; x -= 2)
				if (values[i] == marked1 || values[i] == marked2) {
					g.setColor(Color.RED);
					g.drawLine(x, 0, x, (int) (values[i] * f));
				} else {
					g.setColor(Color.black);
					g.drawLine(x, 0, x, (int) (values[i] * f));
				}
		}
		if (name == "QuickSort-Cir-Vertical" || name == "BubbleSort-Cir-Vertical" || name == "InsertSort-Cir-Vertical"
				|| name == "MergeSort-Cir-Vertical") {
			height = getHeight();
			width = getWidth();

			double f = height; // (double) values.length;
			double cf = 255.0;// (double)values.length;
			int x = width - 3;
			g.setColor(Color.black);
			for (int i = values.length; --i >= 0; x -= 3) {
				g.setColor(new Color(0, (int) (values[i] * cf / 3.0), (int) (values[i] * cf)));
				g.fillOval(3, (int) (values[i] * f), x, height - (int) (values[i] * f));
			}
		}
		if (name == "QuickSort-Cir-Horizontal" || name == "BubbleSort-Cir-Horizontal"
				|| name == "InsertSort-Cir-Horizontal" || name == "MergeSort-Cir-Horizontal") {
			height = getHeight();
			width = getWidth();

			double f = width;
			double cf = 255.0;
			int x = height - 3;
			g.setColor(Color.black);
			for (int i = values.length; --i >= 0; x -= 3) {
				g.setColor(new Color(0, (int) (values[i] * cf / 1.5), (int) (values[i] * cf)));
				g.fillOval((int) (values[i] * f), 3, width - (int) (values[i] * f), x);
			}
		}
		if (name == "QuickSort-Dot" || name == "BubbleSort-Dot" || name == "InsertSort-Dot"
				|| name == "MergeSort-Dot") {

			height = getHeight();
			width = getWidth();

			double f = height;

			int x = width;
			for (int i = values.length; --i >= 0; x -= 3) {
				g.setColor(Color.BLACK);
				g.drawLine(x, height - (int) (values[i] * f), x + 3, height - (int) (values[i] * f));
			}

		}

	}

}