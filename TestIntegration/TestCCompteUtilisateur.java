public class TestCCompteUtilisateur{
    private ICompteUtilisateurs gp;
    
    public TestCCompteUtilisateur(ICompteUtilisateurs gp){
	this.gp =gp ;
    }
    /*On suppose que les tests sont executé un par
 +-----> une dependance entre les tests */

    //Création d'un compte inexistant
    @Test
    public void test1(){
	Boolean res = gp.creerCompte("jo","j1o2j3o4","joe@gmail.com");
	assertTrue(res);
    }

    //Création d'un compte existant
    @Test
    public void test2(){
	Boolean res = gp.creerCompte("jo","j1o2j3o4","joe@gmail.com");
	assertFalse(res);
    }
    //Connexion
    @Test
    public void test3(){
	Boolean res = gp.seConnecter("jo","j1o2j3o4");
	assertTrue(res);
    }

    //Connexion avec login faux
    @Test
    public void test4(){
	Boolean res = gp.seConnecter("babarLelephant","savane");
	assertFalse(res);
    }

    @Test
    public void test5(){
	Boolean res = gp.setCoordon;
	assertFalse(res);
    }
    
}