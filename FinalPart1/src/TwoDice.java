
public class TwoDice extends Dice {
	private int m_CardValue;
	
	public TwoDice(int num)
	{
		super(num);
	}
	
	@Override
	public int Deal()
	{
		m_CardValue = (int)(Math.random() * super.GetCardNumber() * 6 ) + 1;
		return m_CardValue;		
	}
	
	public int CardPoint()
	{
		return m_CardValue;
	}

}
