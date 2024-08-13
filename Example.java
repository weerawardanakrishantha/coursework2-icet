
import java.util.*;

class Example{
	public static void main(String args[]){		
		System.out.println("****************************************************************");
		System.out.println("||                                                            ||");
		System.out.println("||                                                            ||");
		System.out.println("||                             **                             ||");
		System.out.println("||                          ********                          ||");
		System.out.println("||                 **      **********                         ||");
		System.out.println("||               ******   ************                        ||");
		System.out.println("||              ********  ************                        ||");
		System.out.println("||              ********   **********                         ||");
		System.out.println("||               ******      ******                           ||");
		System.out.println("||                 **          **                             ||");
		System.out.println("||              *************************                     ||");
		System.out.println("||             ***************************                    ||");
		System.out.println("||             ***************************    **              ||");
		System.out.println("||             ***************************  ****              ||");
		System.out.println("||             *********************************              ||");
		System.out.println("||             *********************************              ||");
		System.out.println("||             *********************************              ||");
		System.out.println("||             ***************************  ****              ||");
		System.out.println("||             ***************************    **              ||");
		System.out.println("||             ***************************                    ||");
		System.out.println("||              *************************                     ||");
		System.out.println("||                   ****      ****                           ||");
		System.out.println("||                   ***        ***                           ||");
		System.out.println("||                   **          **                           ||");
		System.out.println("||                                                            ||");
		System.out.println("||     __  ________  ____________    __________  _____        ||");
		System.out.println("||    /_ \\/_  _/__/ / __/_ ___/  \\  / / ___/   \\/  /_ \\       ||");
		System.out.println("||   / . / / / _\\\\ / /_ _/ /_/ /\\ \\/ / _/_/ /\\__/ / __ \\      ||");
		System.out.println("||  /_/\\_\\/_/ /__/ \\__//____/_/  \\__/____/_/   /_/_/  \\_\\     ||");
		System.out.println("||                                                            ||");
		System.out.println("****************************************************************");
		System.out.println("\n");
		Scanner x=new Scanner(System.in);
		Scanner y=new Scanner(System.in);
		System.out.print("Enter date: ");
		String date;
		date=x.next();
		System.out.println("\n");
		System.out.print("Enter location: ");
		String lcn;
		lcn=y.nextLine();
		System.out.println("\n\n\n\n\n");

		System.out.println("     _            _ _      _   _      ___ _ _                     ");
		System.out.println("    /_\\__  ____ _( ) |__ _| |_| |___ | __( ) |_ __  ___             ");
		System.out.println("   / _ \\ \\/ /__' | | / _' | _ \\ /  _)| _|| | | '  \\(_.<            ");
		System.out.println("  /_/ \\_\\__/\\__._|_|_\\__._|___/_\\___||_| |_|_|_|_|_/__/            ");
		System.out.println();
		System.out.println("  =====================================================             ");

		System.out.println("\n\n\n");
		System.out.println("  1). Movie 1 - Hall 1"+"\t\t\t\t"+"2). Movie 2 - Hall 2");
		System.out.println("\n");
		System.out.println("  3). Movie 3 - Hall 3"+"\t\t\t\t"+"4). Movie 4 - Hall 4");
		System.out.println("\n");
		Scanner z=new Scanner(System.in);
		System.out.print("Enter Movie number: ");
		int mn;
		mn=z.nextInt();	
		System.out.println("\n\n");
		
		System.out.println("\t\t"+"    _______                             ");
		System.out.println("\t\t"+"   |___ ___|_                           ");
		System.out.println("\t\t"+"      | |  ( )_ _ ____  ___             ");
		System.out.println("\t\t"+"      | |  | | '_   _ \\/  _ \\           ");
		System.out.println("\t\t"+"      | |  | | | | | | |  __/           ");
		System.out.println("\t\t"+"      |_|  |_|_| |_| |_|\\___|           ");		
		System.out.println("\t\t"+"====================================     ");
		
		System.out.println("\n");
		System.out.println("\t\t\t"+"1). 9.00 A.M"+"\n");
		System.out.println("\t\t\t"+"2). 2.00 P.M"+"\n");
		System.out.println("\t\t\t"+"3). 7.00 A.M");
		System.out.println("\n\n");
		Scanner i=new Scanner(System.in);
		System.out.print("Enter Time: ");
		String tm;
		tm=i.nextLine();

		System.out.println("\n\n");
		System.out.println("\t\t\t\t"+"  _____          _                                ");
		System.out.println("\t\t\t\t"+" /  __ \\        | |                               ");
 		System.out.println("\t\t\t\t"+" | /  \\/_   _ __| |_ ___  _ __ __  ___ _ __       ");   
		System.out.println("\t\t\t\t"+" | |   | | | /__| __/ _ \\| '_ ' _\\/ __\\ '__|      ");
		System.out.println("\t\t\t\t"+" | \\__/\\ |_| \\__\\ || (_) | | | | |  __/ |         ");
		System.out.println("\t\t\t\t"+" \\_____/\\__,_|__/\\__\\___/|_| |_|_|\\___|_|         ");
		System.out.println("\n");
		System.out.println("\t\t\t\t"+" ===========================================       ");
		System.out.println("\n\n");
		
		Scanner p=new Scanner(System.in);
		Scanner q=new Scanner(System.in);
		Scanner r=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.print("Name : ");
		String name;
		name=p.nextLine();
		System.out.println("\n");
		System.out.print("Phone Number : ");
		String pn;
		pn=q.nextLine();
		System.out.println("\n");
		System.out.print("Child OR Parent : ");
		String cop;
		cop=r.nextLine();
		System.out.println("\n");
		System.out.print("Number of Tickets : ");
		int nt;
		nt=s.nextInt();
		
		System.out.println("\n\n\n");
		double tax;
		tax = 90.0*0.06;
		double ttax=tax*nt;
		double ftax=Math.round(ttax);
		int ft=(int)ftax;
		//System.out.println(ft);
		
		int total=90*nt+ft;		
		//System.out.println(total);
		
		System.out.println("\n\n\n");
		
		System.out.println(" +================================================================+ ");
		System.out.println(" ||                                                              || ");
		System.out.println(" ||                                                              || ");
		System.out.println(" ||        ___  _________  _________  ________  ________         || ");
		System.out.println(" ||       / _ \\/_ __/ __/ / __/  _/ \\/ / __/  \\/   / __ \\        || ");
		System.out.println(" ||      / , _/ / /_\\ \\  / /__/ //    / _//  /\\_/ / /__\\ \\       || ");
		System.out.println(" ||     /_/\\_\\ /_/|____| \\__/___/_/\\_/___/__/  /_/_/    \\_\\      || ");
		System.out.println(" ||                                                              || ");
		System.out.println(" ||                                                              || ");
		System.out.println(" ||                                                              || ");
		System.out.println(" || "+" Date\t : "+date+"\t\t"+"Location : "+lcn+"      ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" ||..............................................................||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Name\t : "+name+"                                         ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Tickets\t : "+nt+"                                             ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Type\t : "+cop+"                                        ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Time\t : "+tm+"                                      ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Hall\t : "+mn+" Hall"+"                                        ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+" Tax\t : "+ft+"                                            ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" || "+"\t\t\t\t\tTotal : "+total+"              ||");
		System.out.println(" ||                                                              ||");
		System.out.println(" +================================================================+");
		
		
	

}
}

		











