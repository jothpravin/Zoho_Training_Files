public interface Playable
{
	public void play();
}
class Guitar implements Playable
{
	public void play()
	{
		System.out.println("Guitar plays");
	}
}
class Piano implements Playable
{
	public void play()
	{
		System.out.println("Piano Plays");
	}
}
class PlayablePrint
{
	public static void main(String []args)
	{
		Playable gp = new Guitar();
		gp.play();
		Playable pp = new Piano();
		pp.play();
	}
}
