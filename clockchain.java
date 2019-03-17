package blockchain;

import java.util.Date;

public class clockchain {



	public static void main(String[] args) throws Exception {

		blockchain bchain = new blockchain();
		bchain.addBlock(bchain.createGenesisBlock());
		bchain.addBlock(new block(1,block.apply256("tawnda"),bchain.chain.getLast().hash,1212,"loda5"));
		bchain.addBlock(new block(1,block.apply256("hello"),bchain.chain.getLast().hash,1212,"loda5"));
		bchain.addBlock(new block(1,block.apply256("ne6"),bchain.chain.getLast().hash,1212,"loda5"));
		bchain.addBlock(new block(1,block.apply256("nwe6"),bchain.chain.getLast().hash,1212,"loda5"));
		try {
			System.out.println(bchain.getLatestBlock().hash);
			System.out.println(bchain.IsValid());
		
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
