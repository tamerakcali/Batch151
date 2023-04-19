package day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {
//class ismi(UsStatesEnum) ile enum dan istedigimiz eyalet ve bilgilerini  cagirabiliriz.  
        
        String capitalIllinois =UsStatesEnum.ILLINOIS.getCapital();
        
       String abbrivieationOfFlorida= UsStatesEnum.FLORIDA.getAbbreviation();
       
       String stateName =UsStatesEnum.getStateNameByUsingAbbreviation("Ak");//ALASKA
        System.out.println(stateName);
        String abbOfAlaska=UsStatesEnum.getAbbreviationForStateName("Alaska");//Ak
        System.out.println("abbOfAlaska = " + abbOfAlaska);
    }
}
