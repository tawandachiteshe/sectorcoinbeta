package blockchain;
import java.security.MessageDigest;
import java.security.Timestamp;
import java.security.cert.CertPath;
import java.math.*;
public class block {
private int index;
public String previousHash;
private String data;
private long timestamp;
public String hash;


	public block(int index,String previousHash,String data,long timestamp,String hash)
	{
		this.index = index;
		this.previousHash = previousHash;
		this.data = data;
		this.timestamp = timestamp;
		this.hash = hash;
	}


	public static String apply256(String string) throws Exception
	{
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(string.getBytes("UTF-8"));
		BigInteger bigInteger = new BigInteger(1,hash);
		String hashText = bigInteger.toString(16);
		while(hashText.length()<16)
		{
			hashText = "0"+hashText;
		}
		return hashText;
	}

	public String calculateHash() throws Exception
	{
		return apply256(Integer.toString(index)+data+hash+previousHash+Long.toString(timestamp));
	}


}
