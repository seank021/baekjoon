import sys
input = sys.stdin.readline

N, M = map(int, input().split())
pokemons = dict()

for _ in range(N):
    pokemon = input().rstrip()
    pokemons[pokemon] = _ + 1
    pokemons[str(_ + 1)] = pokemon

for _ in range(M):
    question = input().rstrip()
    print(pokemons[question])
