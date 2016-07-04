Dans ce package on a créé des classes permettant de comprendre le concept de Fragment.

On a concrêtement :

- une activité FragmentListActivity dont on associe la vue a un layout (main_activity) contenant juste un fragment (fragment_listview)
- ce layout (fragment_listview) permet de définir l'affichage de base lorsque la liste de fragment est vide
- le name du fragment (com.cberthelot.openclasstutorial.fragment.SimpleListFragment) correspond au nom de la classe héritant de ListFragment

- C'est dans SimpleListFragment qu'on récupère réellement les données à afficher.
- L'affichage est géré grâce à un Adapter dont la construction permet de matcher les éléments du dataModel
sur une vue spécifique en fonction du type de data :
-- dans un premier exercie on a CustomListViewAdapter (utilise uniquement CustomListViewView) pour afficher toujours le même type d'élément
-- Dans un second exercice on a créé DynamicListViewAdapteur (utilise CustomListViewView ou HeaderListViewView) pour avoir un affichage différent en fonction du type de l'élément courant dans la liste

