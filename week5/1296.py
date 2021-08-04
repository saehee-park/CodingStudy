o=input()
n=int(input())
gr=sorted([input() for i in range(n)])
max_i=0
max_re=0
for i in range(n):
    L=o.count("L") + gr[i].count("L")
    O=o.count("O") + gr[i].count("O")
    V=o.count("V") + gr[i].count("V")
    E=o.count("E") + gr[i].count("E")
    p=((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100
    if max_re<p:
        max_re=p
        max_i=i
print(gr[max_i])