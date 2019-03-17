package blockchain;

import java.util.LinkedList;
import java.util.Date;

public class blockchain {


	public LinkedList<block> chain = new LinkedList<>();

	public block createGenesisBlock() throws Exception
	{
		 Date date = new Date();

		return new block(0,block.apply256("genesis"),"firstCoin",date.getTime(),block.apply256("genesis").toString());
	}

	public void addBlock(block Block) throws Exception
	{
		chain.add(createGenesisBlock());
		Block.hash = Block.calculateHash();
		Block.previousHash = getLatestBlock().hash;
		chain.push(Block);

	}
	public block getLatestBlock()
	{
		return chain.pop();
	}

	public boolean IsValid() throws Exception
	{
		boolean isValid = false;
		for (block block : chain) {

			block currentBlock = getLatestBlock();
			if(!currentBlock.previousHash.equals(currentBlock.calculateHash()))
			{
		return isValid;
			}
	else if(!currentBlock.previousHash.equals(previousBlock.previousHash))
	{
		return isValid;
	}else
	{
		return isValid=true;
	}
		}

		return isValid;


	}



}
