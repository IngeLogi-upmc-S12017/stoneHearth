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
	boolean res = gp.seConnecter("jo","j1o2j3o4");
	assertTrue(res);
    }

    //Connexion avec login faux
    @Test
    public void test4(){
	boolean res = gp.seConnecter("babarLelephant","savane");
	assertFalse(res);
    }

    
    /*Set Coord nominal*/	
    @Test
    public void test5(){
	boolean  res = gp.setCoordBancaires("jo", 45769, "000ABC", 45, "LALA");
	assertTrue(res);
    }
    
    /*Set Coord : champs vide */
    @Test
    public void test6(){
	boolean  res = gp.setCoordBancaires("jo", 45769, "", 45, "LALA");
	assertFalse(res);
    }

    /*Changer mot de passe nominal*/
    @Test
    public void test7(){
	boolean res = gp.changerMotDePasse("jo" , "j1o2j3o4" , "patate", "patate");
	assertTrue(res);
    }
    
    /*Mauvais old password*/
    @Test
    public void test8(){
	boolean res = gp.changerMotDePasse("jo" , "KK" , "false", "false");
	assertFalse(res);
    }
    
    /*test jouer partie*/
    @Test
    public void test9(){
    	int test_1 = gp.getUtilisateur("j1").getCompteMatchs();
    	gp.jouerPartie("j1",1);
    	int test_2 = gp.getUtilisateur("j1").getCompteMatchs();
    	assertTrue(test_2>test_1);
    }
    
    /*test jouer partie où le joueur quitte pendant la recherche*/
    @Test
    public void test10(){
    	int test_1 = gp.getUtilisateur("j3").getCompteMatchs();
    	gp.jouerPartie("j3",2);
    	int test_2 = gp.getUtilisateur("j3").getCompteMatchs();
    	assertTrue(test_2==test_1);
    }
    
    
}
