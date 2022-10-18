package zoopla.uk.logintest;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TicTac { 
	
	// Main method, run the game
	public static void main(String[] args) 
	{
	        new TicTac();
	}	 
	
	//create 9 buttons for the spots x and o
	private static JButton spots[] = new JButton [9];
	
	//Constructing the board
	public TicTac()
	{ //Creating the board 

		JFrame tictactoe = new JFrame("TIC TAC TOE");
		tictactoe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		tictactoe.setTitle("TIC TAC TOE");
	
	    JPanel content = new JPanel();
//(1) Divide the content pane into two parts side by side	
	    JPanel game = new JPanel();    
	    JPanel reset = new JPanel();
	    
//(5) The second pane holds a ReStart Button and a text area to display information.	    
	    reset.add(new JLabel("RESET"));
	    final JButton restart = new JButton ();
	    reset.add(restart);
	    restart.add(new JLabel("RESTART BUTTON"));
	    restart.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		if (e.getSource() == restart) 
	    		{
	    			for (int i = 0; i<=8; i++) 
	    			{
	                    	spots[i].setText(" ");
	                }
	                  xORo = 0;  // resets count of moves
	            }
	        }
	    });    
    
	   content.setLayout(new GridLayout(1,2));
	   content.add(game);
	   game.setLayout(new GridLayout(3,3));
	   content.add(reset);
	   reset.setLayout(new GridLayout(2,1));
	   content.setBackground(Color.gray);
	        
	   for(int i=0; i<=8; i++)
	   { 
//(2) In the first pane, create a 3x3 grid for Tic Tac Toe stored as 9 JButtons.
		   spots[i] = new MyButton(); //new class in order to place move
		   game.add(spots[i]);		
	   }  
  
	   tictactoe.pack();
	   tictactoe.getContentPane().add (content);
	   tictactoe.setVisible(true);
	   tictactoe.setSize(500, 300); 
    } // end of board constructor 
	    
	public static int xORo = 0; // counts the moves
	
	/* instead of storing the moves in a array called play
	   and checking if that array is a winner,
	   i just created an array called win
	   with all the winning combinations
	 */
	private static int[][] win = new int[][] {
		{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //horizontal wins
		{0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //vertical wins
		{0, 4, 8}, {2, 4, 6}			 //diagonal wins
};
	
	private static class MyButton extends JButton 
	implements ActionListener
	{   //Created this class with the help of youtube because had trouble displaying the moves with JButton
		boolean gameOver = false;
		String move = " ";
		int play[][] = new int[3][3];
		//(6) Additionally create a 3x3 two dimensional array called play, and store moves in it as the game is progressing.
		public MyButton() 
		{	 
			super();
			move=" ";
			setFont(new Font("Dialog", 1, 60));
			// (4) Increase the font size to fill each square of the grid with either an “X” or an “O”.
			setText(move);
			addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			if((xORo%2)==0 && getText().equals(" ") && gameOver==false)
			{
				move="X";		
				//play[xORo/3][xORo%3] = spots.length
				System.out.println("Move #" + xORo + " was by " + move);
				xORo=xORo+1;

				
			} 
			else if((xORo%2)==1 && getText().equals(" ") && gameOver==false)
			{
				move="O";
				//play[xORo/3][xORo%3] = spots.length
				System.out.println("Move #" + xORo + " was by " + move);
				xORo=xORo+1;
			} 
			setText(move);
		
		
		// Checks for a win
		for(int i=0; i<=7; i++)
		{ 
			if( spots[win[i][0]].getText().equals(spots[win[i][1]].getText()) && 
				spots[win[i][1]].getText().equals(spots[win[i][2]].getText()) && 
				spots[win[i][0]].getText() != " ")
			{
				gameOver = true;
			}
		}
		
		if( gameOver == true) //if there is a winner
		{ 
			JOptionPane.showMessageDialog(null, move + " wins the game! Hit Restart to play again");
			
		} 
		
		else if(xORo == 9 && gameOver == false) // If theres a draw
		{ 
				JOptionPane.showMessageDialog(null,"Tie game! Hit Retart to play again");
			gameOver = true;
		}	
	 }
   }  
}	

