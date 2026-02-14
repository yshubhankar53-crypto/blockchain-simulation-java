import java.util.ArrayList;

public class Main {

    public static ArrayList<Block> blockchain = new ArrayList<>();
    public static int difficulty = 3;

    public static void main(String[] args) {

        System.out.println("Mining block 1...");
        blockchain.add(new Block("Genesis Block", "0"));
        blockchain.get(0).mineBlock(difficulty);

        System.out.println("Mining block 2...");
        blockchain.add(new Block("Second Block", blockchain.get(0).hash));
        blockchain.get(1).mineBlock(difficulty);

        System.out.println("Mining block 3...");
        blockchain.add(new Block("Third Block", blockchain.get(1).hash));
        blockchain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain valid: " + isChainValid());
    }

    public static boolean isChainValid() {

        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < blockchain.size(); i++) {

            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                return false;
            }

            if (!currentBlock.previousHash.equals(previousBlock.hash)) {
                return false;
            }
        }

        return true;
    }
}
