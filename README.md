# TD SORCIER
--------

## Les classes

  Tout le monde hérite de la classe **Victime** (j'aurais pu utiliser une interface, mais j'avais écrit le code avant d'être familier avec ces dernières.) 
  Les **Monstres** et les **Sorciers** héritent de la classe **Personnage**, et les **Magiciens** héritent de **Sorcier**.
  De même, les **Gnomes** héritent des **Nains** qui héritent de Victime. 
  
## Les interfaces 

  Je n'ai utilisé qu'une interface : **SuperPouvoir**, utilisée par les Magiciens et les Gnomes. 
  
## Le déroulement du jeu
  ### Les tableaux de jeu 
  J'utilise deux listes, pour séparer les joueurs *pouvant* attaquer, aux monstres qui ne peuvent que subir. Ainsi, je peux choisir mon attaquant dans le premier tableaux, et mon défenseur dans l'un des deux tableaux. Je réitère mon choix tant que je tire le même joueur pour attaquer et défendre. 
  > **Remarque** J'aurais pu choisir de tirer exclusivement des personnages vivant, mais sachant que mon code empèche les personnages d'attaquer, je n'ai pas voulu en rajouter. En revanche, un personnage peut attaquer un mort, ce qui peut parfois permettre aux Sorciers de réssusciter (Ce sont des sorciers après tout...)
  
  ### Les rounds
  
  La partie se déroule sur 10 rounds. À la fin, j'affiche l'état de tout les joueurs. On pourrais s'amuser à continuer la partie jusqu'à ce qu'il ne reste plus qu'un joueur vivant, mais cela rique de durer longtemps puisque les sorciers ne peuvent pas s'attaquer entre eux. 
  
  ### Les attaques 
  
  Lorsqu'un joueur en attaque un autre, on affiche le type de combattant, ses points de vie ou solidité (par abus, j'affiche "pdv" meme lorsqu'il s'agit de Nains, pour ne pas rajouter de tests inutiles) ainsi que la force de l'attaque. 
  
  > **Remarque** Il s'agit de la force avec laquelle l'attaquant attaque, ce qui ne correspond pas à ce que le défenseur *subit*. Par exemple, un sorcier aura beau attaquer avec x force un autre sorcier, ce dernier ne subira pas de dégats. J'aurais pu afficher les dégats réellement subits, mais encore une fois je voulais éviter de surchager de prints.
  
  ### Les renvois 
  
  Lorsqu'un joueur est attaqué, il retourne des dégats, ce que j'affiche également.
  
  > **Remarque** Le signe du renvoit est important ! S'il est négatif, il s'agit bien d'un retour de dégats que l'attaquant va subir, s'il est positif, il s'agit d'un montant qui *soigne* l'attaquant. 
  
  
