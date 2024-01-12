package week2.day3;

public class MissingWords {

	public static void main(String[] args) {
       String text = "We learn Java basics as part of java sessions in java week1";
		String word[] = text.split(" ");
		for(int i=0; i<word.length;i++)
		{
			if(word[i].isEmpty())
			{
				continue;
			}
			for (int j=i+1;j<word.length;j++)
			{
				if(word[j].equalsIgnoreCase(word[i]))
				{
					word[j]=" ";
				}
			}
		}
		
		String text1 = String.join(" ", word);
		System.out.println(text1);
	}

	}


