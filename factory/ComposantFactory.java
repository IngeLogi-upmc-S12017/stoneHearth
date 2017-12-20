public class ComposantFactory{
	public static ICompteUtilisateurs createGUtilisateurs(IPartie partie){
        return new GestionnaireUtilisateurs(partie);
    }
    
    public static ICartes createGCartes(ICompteUtilisateurs gcu, IBank bank){
        return new GestionnaireCartes(gcu,bank);
    }
    
    public static IBankcreateGBank(){
        return new GestionnaireBank();
    }
    
    public static IPartie createGMoteurJeu(){
        return new CMoteurJeu();
    }
    
    public static ICompteUtilisateurs createGUtilisateursMock(){
        return new CCompteUtilBouchon();
    }
    
    public static ICartes createGCartesMock(){
        return new CCartesBouchon();
    }
    
    public static IBank createGBankMock(){
        return new CBankBouchon();
    }
    
    public static IPartie createGMoteurJeuMock(){
        return new CMoteurJeuBouchon();
    }
    
    public static createTestCartes(){
    	return new TestCartes(createGCartes(createGUtilisateursMock(),createGBankMock())));
    }
    public static createTestCompteUtil(){
    	return new TestCCompteUtilisateur(createGMoteurJeuMock());
    }
    public static createTestPartie(){
    	return new TestPartie(createGMoteurJeu());
    }
}
