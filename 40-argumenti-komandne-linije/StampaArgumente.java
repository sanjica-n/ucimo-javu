/**
* Stampa argumente koji se proslede putem komandne linije
* pozivanje: java StampaArgumente zdravo svete
*/

class StampaArgumente {
  public static void main (String args[]) {

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }

  }
}
