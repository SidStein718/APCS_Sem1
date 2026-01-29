/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*20 + 15);
        System.out.println(Math.random()*10001+5234);
        int high = (int)(Math.random()*50+30);
        int low = (int)(Math.random()*50+90);
        
        int c = (int)(Math.random()*(high-low)+low);
        System.out.println(c);
    
	}
}
