import java.util.*;
import in3.*;
import in3.eth1.*;
import java.math.BigInteger;

public class GetTransaction {
  //
  public static void main(String[] args) throws Exception {
    // create incubed
    IN3 in3 = IN3.forChain(Chain.MAINNET); // set it to mainnet (which is also dthe default)

    
    Transaction txn = getTransactionAPI(in3);
    if(null != txn) {
    	System.out.println("Block num "+txn.getBlockNumber());
    }
    
    String rpcResponse = getTransactionRPC(in3);
    
    if(null != rpcResponse) {
    	System.out.println(rpcResponse);
    }
  }
  
  static Transaction getTransactionAPI(IN3 in3) {
	  
	  return in3.
			  getEth1API().
			  getTransactionByHash("0xdd80249a0631cf0f1593c7a9c9f9b8545e6c88ab5252287c34bc5d12457eab0e");

	  
  }
  
  static String getTransactionRPC(IN3 in3) {
	  
	  
	  return in3.sendRPC("eth_getTransactionByHash", 
			  new Object[]{ 
					  "0xdd80249a0631cf0f1593c7a9c9f9b8545e6c88ab5252287c34bc5d12457eab0e"
			  		 
			  		 });
  }

}

