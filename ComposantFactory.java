public class ComposantFactory{
	public static ICompteUtilisateurs createGUtilisateurs(IPartie partie){
		new GestionnaireUtilisateur(partie);
	}
}