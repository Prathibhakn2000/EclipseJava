package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Sock;

	public class SockRunner {

		public static void main(String[] args) {
			
			Sock sock =new Sock();
			sock.material="cotton";
			sock.length=6;
			sock.color="blue";
			
			Sock sock1 =new Sock();
			sock1.material="cotton";
			sock1.length=6;
			sock1.color="blue";
			
			Sock sock2 =new Sock();
			sock2.material="cotton";
			sock2.length=6;
			sock2.color="blue";
			
			Sock sock3 =new Sock();
			sock3.material="cotton";
			sock3.length=5;
			sock3.color="black";
			

			boolean ref = sock.equals(null);
			System.out.println(ref);
			
			boolean ref1 = sock.equals(sock1);
			System.out.println(ref1);
			
			boolean ref2 = sock.equals(sock2);
			System.out.println(ref2);
			
			boolean ref3 = sock2.equals(sock3);
			System.out.println(ref3);

			

		}

	


}
