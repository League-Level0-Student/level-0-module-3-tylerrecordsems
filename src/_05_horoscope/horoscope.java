package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	
	

	
	String A = JOptionPane.showInputDialog("What is your star sign");
		
		if (A.equalsIgnoreCase("Aries")) {
			 JOptionPane.showMessageDialog(null,"Your friends and those around you will look to you for advice and help today, with one person in particular needing you.");
		}else if(A.equalsIgnoreCase("Taurus")){
			JOptionPane.showMessageDialog(null,"You can take back power in your finances today and find forward motion, but be prepared for it.");
		}else if(A.equalsIgnoreCase("Gemini")){
			JOptionPane.showMessageDialog(null,"Insight is coming your way today, which will lead you to find something new out about your partner");
		}else if(A.equalsIgnoreCase("Cancer")){	
			JOptionPane.showMessageDialog(null,"Your energy is positive, but also a little wild today and you need to control it and keep it contained.");
		}else if(A.equalsIgnoreCase("Leo")){
			JOptionPane.showMessageDialog(null,"When you are drawn to beautiful things today indulge yourself, you will be inspired.");
		}else if(A.equalsIgnoreCase("Vigro")){
			JOptionPane.showMessageDialog(null,"Someone will try to make you look bad later, so keep a written record of everything so you have evidence.");
		}else if(A.equalsIgnoreCase("Libra")){
			JOptionPane.showMessageDialog(null,"Make sure you can back up those first impression you create with substance today, but first impressions first.");
		}else if(A.equalsIgnoreCase("Scorpio")){
			JOptionPane.showMessageDialog(null,"Seek stability and security today, put down roots at work and in your home life, it's time to settle.");
		}else if(A.equalsIgnoreCase("Sagittarius")){
			JOptionPane.showMessageDialog(null,"Something negative may come along today to create balance with the positive things, keep perspective.");
		}else if(A.equalsIgnoreCase("Capricorn")){
			JOptionPane.showMessageDialog(null,"When you want to daydream today but you feel guilty, allow yourself this creative brain freedom.");
		}else if(A.equalsIgnoreCase("Aquarius")){
			JOptionPane.showMessageDialog(null,"Use your strong energy to get ahead today and show others what you can do, but use it socially too.");
		}else if(A.equalsIgnoreCase("Pisces")){
			JOptionPane.showMessageDialog(null,"Your strong communication and decision making skills will bring a lift to your finances today.");
		}else JOptionPane.showMessageDialog(null, "That is not a star sign");
			
			
			
			
		
		
		
		
		}
	
}

