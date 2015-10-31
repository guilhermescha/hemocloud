package br.com.hemocloud.util;

public class TransactionUtil {

	private static long transactionStart;

	public static void transactionStart() {
		transactionStart = System.currentTimeMillis();
	}

	public static void transactionEnd(String msg) {
		System.out.println(msg + ": " + String.valueOf(System.currentTimeMillis() - transactionStart) + "ms");
	}

}
