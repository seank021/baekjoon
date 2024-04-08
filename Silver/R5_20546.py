import sys
input = sys.stdin.readline

money = int(input())
stock = list(map(int, input().split()))

def alg_j():
    result_money = money
    stock_n = 0
    for stock_i in stock:
        stock_n += result_money // stock_i
        result_money %= stock_i
        if result_money == 0:
            break
    return result_money, stock_n

def alg_s():
    result_money = money
    stock_n = 0
    for i in range(len(stock) - 4):
        if stock[i] < stock[i+1] < stock[i+2] < stock[i+3]:
            result_money += stock_n * stock[i+3]
            stock_n = 0
        if stock[i] > stock[i+1] > stock[i+2] > stock[i+3]:
            stock_n += result_money // stock[i+3]
            result_money %= stock[i+3]
    return result_money, stock_n

money_j, stock_j = alg_j()
money_s, stock_s = alg_s()

result_j = money_j + stock_j * stock[-1]
result_s = money_s + stock_s * stock[-1]

if result_j > result_s:
    print("BNP")
elif result_j < result_s:
    print("TIMING")
else:
    print("SAMESAME")
