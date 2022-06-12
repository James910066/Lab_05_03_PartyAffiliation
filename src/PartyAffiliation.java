public class PartyAffiliation
{

    public static void main(String[] args)
    {
        //string partyAffiliation
        //string DEMOCRAT = “democrat”
        //string REPUBLICAN = “republican”
        //string INDEPENDENT = “independent”
        //output "Enter your polical party affiliation"
        //input partyAffiliation
        //If partyAffiliation == DEMOCRAT then
        //output "You get a Democratic Donkey"
        //Else If partyAffiliation = = REPUBLICAN then
        //output "You get a Republican Elephant"
        //Else
        //output "You get an Independent man"
        //endIf

        String partyChoice = "";
        String menu = "D - Democrat R - Republican I - Independent";

        //input partyAffiliation
        partyChoice = "T";
        if (partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println(" You get an Independent Man.");
        }
        else
        {
            System.out.println("You chose the Other party");
        }
    }

}
