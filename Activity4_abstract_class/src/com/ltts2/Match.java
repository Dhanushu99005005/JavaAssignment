package com.ltts2;

public abstract class Match {
	private int currentscore;
	private float currentover;
	private int target;
	final protected int ballsPerOver=6;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public abstract double calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunRate,int balls);

}

class ODIMatch extends Match{
	final private int Overs= 50;
	
	public double calculateRunRate() {
		return (this.getTarget()-this.getCurrentscore())/(this.Overs-this.getCurrentover());
	}
	
	public int calculateBalls() {
		return (int) ((this.Overs-this.getCurrentover())*this.ballsPerOver);
	}
	public void display(double reqRunRate,int balls) {
		System.out.println("Requirements");
		System.out.println("Need "+(this.getTarget()-this.getCurrentscore())+" runs in "+balls+" balls");
		System.out.println("Required RunRate : "+reqRunRate);
	}
}

class TestMatch extends Match{
	final private int Overs= 90;
	
	public double calculateRunRate() {
		return (this.getTarget()-this.getCurrentscore())/(this.Overs-this.getCurrentover());
	}
	
	public int calculateBalls() {
		return (int) ((this.Overs-this.getCurrentover())*this.ballsPerOver);
	}
	public void display(double reqRunRate,int balls) {
		System.out.println("Requirements");
		System.out.println("Need "+(this.getTarget()-this.getCurrentscore())+" runs in "+balls+" balls");
		System.out.println("Required RunRate : "+reqRunRate);
    }
}

class T20Match extends Match{
	final private int Overs= 20;
	
	public double calculateRunRate() {
		return (this.getTarget()-this.getCurrentscore())/(this.Overs-this.getCurrentover());
	}
	
	public int calculateBalls() {
		return (int) ((this.Overs-this.getCurrentover())*this.ballsPerOver);
	}
	public void display(double reqRunRate,int balls) {
		System.out.println("Requirements");
		System.out.println("Need "+(this.getTarget()-this.getCurrentscore())+" runs in "+balls+" balls");
		System.out.println("Required RunRate : "+reqRunRate);
    }
}
