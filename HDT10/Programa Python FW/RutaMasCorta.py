import networkx as nx

# Crear la matriz de adyacencia
#andre marroquin
#programa pythpon ruta mas corta floywarshal  con libreria networkx
#hdt10
#estructuras de datos
matriz = [
    [10,15,20,50],
    [15,20,30,80],
    [20,12,15,20],
    [20,30,10,15],
    
]

# Crear un grafo dirigido
grafo = nx.DiGraph()

# Agregar los nodos al grafo
grafo.add_nodes_from(range(len(matriz)))

# Agregar las aristas al grafo con los pesos correspondientes
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        if matriz[i][j] != float('inf'):
            grafo.add_edge(i, j, weight=matriz[i][j])

# Calcular las distancias entre todos los pares de nodos
distancias = dict(nx.all_pairs_dijkstra_path_length(grafo, weight='weight'))

# Imprimir las distancias entre todos los pares de nodos en orden ascendente
print()
print("La matriz final con los resultados de las rutas mas cortas es la siguiente: ")
for nodo in sorted(distancias.keys()):
    distancias_destino = distancias[nodo]
    print()
    print(f"Distancias desde el nodo {nodo+1}:")
    for destino, distancia in sorted(distancias_destino.items()):
        print(f"La distancia de {nodo} a {destino} es {distancia}")
    print()

