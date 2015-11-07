package br.com.hemocloud.util;

public class TransactionUtil {

	private static long transactionStart;

	public static void transactionStart() {
		transactionStart = System.nanoTime();
	}

	public static void transactionEnd(String msg) {
		System.out.println(msg + ": " + String.valueOf(System.nanoTime() - transactionStart) + "ns");
	}

}