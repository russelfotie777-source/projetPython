5

nb_termes = input("Combien de termes Voulez vous afficher ? ")

if nb_termes.isdigit():
    nb_termes = int(nb_termes)
    compteur = 0
    a = 0
    b = 1

    while compteur < nb_termes:
        print(a)
        c = a + b
        a = b
        b = c
        compteur += 1
else:
    print("Veuillez entrer un nombre valide.")
    exit()

