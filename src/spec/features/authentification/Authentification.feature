Feature: Je verifie la page de la connexion 
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifie la page de la connexion
   Given Je me connecte sur le site Mercury
   When Je saisie le username "test"
   And Je saisie le mot de passe "test"
   And Je clique sur le bouton submit 
   Then je me redirige vers la page home "Login Successfully"
