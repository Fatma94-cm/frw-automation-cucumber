Feature: Je verifie la page Inscription
  En tant que utilisateur je souhaite me inscrire au site Mercury

  @register
  Scenario: Je verifie la page Inscription
    Given Je me connecte sur le site Mercury
    When Je clique sur le bouton "REGISTER"
    When Je saisie le Prénom "OMRANI"
    And Je saisie le Nom "FATMA"
    And Je saisie le Telephone "+216 52919601"
    And Je saisie le mail "omranifatma77@gmail.com"
    And Je saisie l adresse "11 rue 10406 Elouardia"
    And Je saisie la ville "Tunis"
    And Je saisie l Etat/Province "Elouardia"
    And Je saisie le code postal "2053"
    And Je saisie le pays "Tunisie"
    And Je saisie le Nom d'utilisateur "Fatma"
    And Je saisie le mot de passe "test"
    And Je resaisie le mot de passe  "test"
    And Je clique sur le bouton Envoyer
    Then je me redirige vers la page Register
