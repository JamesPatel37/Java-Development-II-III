package homework1;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GameBoard extends Balloon {
	Timer timer; // timer reference!
	CanvasPanel canvasPanel;
	RadiusAction ra;
	//Balloon b1, b2, b3, b4, b5, b6;
	MyStack myStack;
	JLabel jlabel;
	int Score = 0;
	int Scorezero;

        //
        Balloon b;
        final int N = 8;
        Balloon[] balloons;
        //
        
        
	class StartTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.start();

//			b1.exist = true;
//			b2.exist = true;
//			b3.exist = true;
//			b4.exist = true;
//			b5.exist = true;
//			b6.exist = true;

                       //milin
                       for (int i = 0; i < N; i++) {
                            balloons[i].exist=true;
                        }
                        //milin ends
			
		}
	}

	class StopTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.stop();

			// clearing arraylist
			// Scorezero = myStack.arraylist.clear();
			// display final Score
			UpdateScorezeo();

//			b1.exist = false;
//			b2.exist = false;
//			b3.exist = false;
//			b4.exist = false;
//			b5.exist = false;
//			b6.exist = false;
//                        
                        
                       //milin 
                        for (int i = 0; i < N; i++) {
                            balloons[i].exist=false;
                        }
                       //milin ends

		}
	}

	class PauseTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.stop();

//			b1.exist = false;
//			b2.exist = false;
//			b3.exist = false;
//			b4.exist = false;
//			b5.exist = false;
//			b6.exist = false;
//                        
                        //milin 
                        for (int i = 0; i < N; i++) {
                            balloons[i].exist=false;
                        }
                       //milin ends
		}
	}

	class RadiusAction implements ActionListener {
		private int radius = 10;

		int getRadius() {
			return radius;
		}

		void resetRadius() {
			radius = 5;
		}

		public void actionPerformed(ActionEvent e) {

			// called when every frame is repainted

			radius += 20;
			canvasPanel.repaint();
		}
	}

	class CanvasPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		CanvasPanel() {
			super();
			this.addMouseListener(new MouseAction());
		}

		protected void paintComponent(Graphics pen) {

			super.paintComponent(pen);

			// center
			double d12, d23, d34, d45, d56, d61;

//			double dx1 = Math.pow((b2.x - b1.x), 2);
//			double dy1 = Math.pow((b2.y - b1.y), 2);
//			d12 = Math.pow((dx1 + dy1), 0.5);
//
//			double dx2 = Math.pow((b3.x - b2.x), 2);
//			double dy2 = Math.pow((b3.y - b2.y), 2);
//			d23 = Math.pow((dx2 + dy2), 0.5);
//
//			double dx3 = Math.pow((b4.x - b3.x), 2);
//			double dy3 = Math.pow((b4.y - b3.y), 2);
//			d34 = Math.pow((dx3 + dy3), 0.5);
//
//			double dx4 = Math.pow((b5.x - b4.x), 2);
//			double dy4 = Math.pow((b5.y - b4.y), 2);
//			d45 = Math.pow((dx4 + dy4), 0.5);
//
//			double dx5 = Math.pow((b6.x - b5.x), 2);
//			double dy5 = Math.pow((b6.y - b5.y), 2);
//			d56 = Math.pow((dx5 + dy5), 0.5);
//
//			double dx6 = Math.pow((b6.x - b1.x), 2);
//			double dy6 = Math.pow((b6.y - b1.y), 2);
//			d61 = Math.pow((dx6 + dy6), 0.5);
//
//			// positioning balloons such that they dont overlap
//			if (d12 <= (b2.radius + b1.radius)) {
//				b1.vx = b1.vx * -1;
//				b1.vy = b1.vy * -1;
//				b2.vx = b2.vx * -1;
//				b2.vy = b2.vy * -1;
//			}
//			if (d23 <= (b2.radius + b3.radius)) {
//				b3.vx = b3.vx * -1;
//				b3.vy = b3.vy * -1;
//
//				b2.vx = b2.vx * -1;
//				b2.vy = b2.vy * -1;
//			}
//			if (d34 <= (b4.radius + b3.radius)) {
//				b3.vx = b3.vx * -1;
//				b3.vy = b3.vy * -1;
//				b4.vx = b4.vx * -1;
//				b4.vy = b4.vy * -1;
//			}
//			if (d45 <= (b5.radius + b4.radius)) {
//				b4.vx = b4.vx * -1;
//				b4.vy = b4.vy * -1;
//				b5.vx = b5.vx * -1;
//				b5.vy = b5.vy * -1;
//			}
//			if (d56 <= (b6.radius + b5.radius)) {
//				b5.vx = b5.vx * -1;
//				b5.vy = b5.vy * -1;
//				b6.vx = b6.vx * -1;
//				b6.vy = b6.vy * -1;
//			}
//			if (d61 <= (b6.radius + b1.radius)) {
//				b1.vx = b1.vx * -1;
//				b1.vy = b1.vy * -1;
//				b6.vx = b6.vx * -1;
//				b6.vy = b6.vy * -1;
//			}
//
//			if (b1.exist == true) {
//				Color randomColor1 = new Color(b1.R, b1.G, b1.B);
//				pen.setColor(randomColor1);
//				pen.fillOval(b1.x, b1.y, b1.radius, b1.radius);
//
//			}
//			if (b2.exist == true) {
//				Color randomColor2 = new Color(b2.R, b2.G, b2.B);
//				pen.setColor(randomColor2);
//				pen.fillOval(b2.x, b2.y, b2.radius, b2.radius);
//
//			}
//			if (b3.exist == true) {
//				Color randomColor3 = new Color(b3.R, b3.G, b3.B);
//				pen.setColor(randomColor3);
//				pen.fillOval(b3.x, b3.y, b3.radius, b3.radius);
//
//			}
//			if (b4.exist == true) {
//				Color randomColor4 = new Color(b4.R, b4.G, b4.B);
//				pen.setColor(randomColor4);
//				pen.fillOval(b4.x, b4.y, b4.radius, b4.radius);
//
//			}
//			if (b5.exist == true) {
//				Color randomColor5 = new Color(b5.R, b5.G, b5.B);
//				pen.setColor(randomColor5);
//				pen.fillOval(b5.x, b5.y, b5.radius, b5.radius);
//
//			}
//			if (b6.exist == true) {
//				Color randomColor6 = new Color(b6.R, b6.G, b6.B);
//				pen.setColor(randomColor6);
//				pen.fillOval(b6.x, b6.y, b6.radius, b6.radius);
//
//			}
//                        
                        
                        
                        //milin
                        for (int i = 0; i < N; i++) {
                            
                            if (balloons[i].exist == true) {
				Color randomColor6 = new Color(balloons[i].R,balloons[i].G, balloons[i].B);
				pen.setColor(randomColor6);
				pen.fillOval(balloons[i].x,balloons[i].y, balloons[i].radius, balloons[i].radius);
                            }
                        
                        }
                        //milin ends
			


// for each neighbor:
			// compute distance between my center (x,y) and my
			// neighbor's center (x,y), if distance <= r1 + r2
			// then update my velocity: vx = vx * -1, vy = vy * -1
			// and done checking
			// get center of b1 and b2 and b3
			// get radius of b1,b2,b3

//			b1.drift(3);
//			b2.drift(3);
//			b3.drift(3);
//			b4.drift(3);
//			b5.drift(3);
//			b6.drift(3);

                        //milin
                         for (int i = 0; i < N; i++) {
                            balloons[i].drift();
                        }
                        //milin ends
		}
	}

	class MouseAction implements MouseListener {

		public void mouseClicked(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			System.out.println("x = " + x + " y = " + y);

			// simple check to see if the mouse location is inside the circle
			// area.

                        //milin
                        double[] radiiSquare = new double[N];
                        for (int i = 0; i < N; i++) {
                            radiiSquare[i] =  Math.pow(balloons[i].radius, 2);
                         }
                        
                        double[] distance_x = new double[N];
                        double[] distance_y = new double[N];
                        
                        for (int i = 0; i < N; i++) {
                        
                            //distance from each balloon of point
                            distance_x[i] =  Math.pow((x - balloons[i].x), 2);
                            distance_y[i] =  Math.pow((x - balloons[i].y), 2);
                            
                            if (distance_x[i] + distance_y[i] < radiiSquare[i]) {
                                System.out.println("balloon no. "+i+" is clicked");
				balloons[i].exist = false;
				myStack.push(balloons[i]);
				UpdateScore();
                            }
                    }
                        //milin ends
			
                        // check where clicked
//			double radiusSquare1 = Math.pow(b1.radius, 2);
//			double radiusSquare2 = Math.pow(b2.radius, 2);
//			double radiusSquare3 = Math.pow(b3.radius, 2);
//			double radiusSquare4 = Math.pow(b4.radius, 2);
//			double radiusSquare5 = Math.pow(b5.radius, 2);
//			double radiusSquare6 = Math.pow(b6.radius, 2);
//
//			double cx1 = Math.pow((x - b1.x), 2);
//			double cy1 = Math.pow((y - b1.y), 2);
//
//			double cx2 = Math.pow((x - b2.x), 2);
//			double cy2 = Math.pow((y - b2.y), 2);
//
//			double cx3 = Math.pow((x - b3.x), 2);
//			double cy3 = Math.pow((y - b3.y), 2);
//
//			double cx4 = Math.pow((x - b4.x), 2);
//			double cy4 = Math.pow((y - b4.y), 2);
//
//			double cx5 = Math.pow((x - b5.x), 2);
//			double cy5 = Math.pow((y - b5.y), 2);
//
//			double cx6 = Math.pow((x - b6.x), 2);
//			double cy6 = Math.pow((y - b6.y), 2);

			// for circle1
//			if (cx1 + cy1 < radiusSquare1) {
//				System.out.println("1st Balloon(Circle) clicked");
//				b1.exist = false;
//				myStack.push(b1);
//				UpdateScore();
//
//			}
//			if (cx2 + cy2 < radiusSquare2) {
//				System.out.println("2nd Balloon(Circle) clicked");
//				b2.exist = false;
//				myStack.push(b2);
//				UpdateScore();
//			}
//			if (cx3 + cy3 < radiusSquare3) {
//				System.out.println("3rd Balloon(Circle) clicked");
//				b3.exist = false;
//				myStack.push(b3);
//				UpdateScore();
//			}
//			if (cx4 + cy4 < radiusSquare4) {
//				System.out.println("4th Balloon(Circle) clicked");
//				b4.exist = false;
//				myStack.push(b4);
//				UpdateScore();
//			}
//			if (cx5 + cy5 < radiusSquare5) {
//				System.out.println("5th Balloon(Circle) clicked");
//				b5.exist = false;
//				myStack.push(b5);
//				UpdateScore();
//			}
//			if (cx6 + cy6 < radiusSquare6) {
//				System.out.println("6th Balloon(Circle) clicked");
//				b6.exist = false;
//				myStack.push(b6);
//				UpdateScore();
//			}

			// UpdateScore();

		}

		public void mouseEntered(MouseEvent event) {
		}

		public void mouseExited(MouseEvent event) {
		}

		public void mousePressed(MouseEvent event) {
		}

		public void mouseReleased(MouseEvent event) {
		}

	}

	GameBoard() {
                       //milin
                        balloons = new Balloon[N];
                        //creating 3 balloons objects
                        for (int i = 0; i < N; i++) {
                                balloons[i] = new Balloon();
                        }
//                        try {
//                                balloons[N].drift();
//                        } catch (Exception ex) {
//                                // this time: do nothing!
//                                System.out.println("hey dude, can't drift this");
//                                ex.printStackTrace();
//                        }
//
//                        try {
//                                System.out.println(balloons[N]);
//                        } catch (Exception ex) {
//                                System.out.println("hey dude, can't print this");
//                        }
                        //milin ends
	
                        
                        
//                        b1 = new Balloon();
//		b2 = new Balloon();
//		b3 = new Balloon();
//		b4 = new Balloon();
//		b5 = new Balloon();
//		b6 = new Balloon();
		myStack = new MyStack();

		JFrame frame = new JFrame("simple gui");
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 0));

		// create radius action
		ra = new RadiusAction();

		// create a timer to update the action
		timer = new Timer(1000, ra);

		// create the panel
		canvasPanel = new CanvasPanel();
		JPanel controlPanel = new JPanel();
		// controlPanel .setBorder(new LineBorder(Color.blue));
		// win.getContentPane().add(controlPanel ,"Center");

		// create a button widget
		JButton startButton = new JButton("start");
		startButton.addActionListener(new StartTimer());
		startButton.setBounds(getHeight() - 10, getWidth() - 10, 5, 10);

		JButton stopButton = new JButton("stop");
		stopButton.addActionListener(new StopTimer());

		JButton pauseButton = new JButton("pause");
		pauseButton.addActionListener(new PauseTimer());

		jlabel = new JLabel();
		Score = myStack.arraylist.size();
		jlabel.setVisible(true);
		jlabel.setText("Score:" + Score);
		jlabel.setBounds(0, 0, 20, 20);

		// add the button to the panel
		controlPanel.add(startButton);
		controlPanel.add(stopButton);
		controlPanel.add(pauseButton);
		controlPanel.add(jlabel);
		// canvas specific layout
		canvasPanel.setLayout(new GridLayout(1, 1));

		// canvasPanel.setSize(100, 100);
		// add the panel to the frame
		frame.add(canvasPanel);
		frame.add(controlPanel);

	}

	public void UpdateScore() {
		Score = Score + 1;
		// Score = myStack.arraylist.size();
		jlabel.setText("Score:" + Score);

	}

	public void UpdateScorezeo() {
		Score = 0;
		jlabel.setText("Score:" + Score);
	}

	public static void main(String args[]) {
		GameBoard g1 = new GameBoard();
	}
}