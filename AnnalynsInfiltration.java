package packageSketch;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       if(knightIsAwake == true) {
    	   System.out.println("K = true:");
    	   System.out.println("The knight is awake, no fast attack is available in the moment!"); 
    	   return false;
}// end of if
       else{
    		System.out.println("\nK = false:");													
    	   System.out.println("Go go go! The knight is sleeping! Fast attack incoming!");		
    		return true;
}// end of else
}// end of FastAttack

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == false && archerIsAwake == true && prisonerIsAwake == false ) {
        	System.out.println("K = false, A = true, P = false:");
        	System.out.println("You can spy! Just be careful to not get caught!");
        	return true;
}// end of if
        else {
        	System.out.println("\nEvery other combination:");
        	System.out.println("You can't spy right now, try later!");
        	return false;
}// end of else
}// end of Spy

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    	if(archerIsAwake == false && prisonerIsAwake == true) {
    		System.out.println("A = false, P = true");
    		System.out.println("You can signal the prisoner! *bird signaling sounds*"); 
    		return true;
}// end of if
    	else {
    		System.out.println("\nOther combinations:");
    		System.out.println("You can't signal the prisoner right now!"); 
    		return false;
}// end of else
}// end of SignalP

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
   	 	if(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true) {
   	 		System.out.println("K = true, A = false, P = false or true, D = true:");	
   	 		System.out.println("This is your chance, go for it! Save your friend!\n");
   	 		return true;
}//end of if
   	 	else if(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true) {
   	 		System.out.println("K = true, A = false, P = false or true, D = true:");
   	 		System.out.println("This is your chance, go for it! Save your friend!\n");	
	 		return true;
}// end of else if (1)
   	 	else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false) {
   	 		System.out.println("K = false, A = false, P = true, D = false or true:");		
   	 		System.out.println("Go for it! But be skeany, they can wake up at any moment!\n");	
   	 		return true;
}// end of else if (2)
   	 	else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true) {
   	 	System.out.println("K = false, A = false, P = true, D = false or true:");			
	 		System.out.println("Go for it! But be skeany, they can wake up at any moment!\n");
	 		return true;
}// end of else if (3)
   	 	else {
   	 		System.out.println("Remaining combinations:");
   	 		System.out.println("Can't save your friend right now! Wait a little more!\n");
   	 		return false;
   	 	}
}// end of FreeP

}// end of class