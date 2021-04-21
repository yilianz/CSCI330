
print(f" 2**3**2 = {2**3**2}")
a = -2**2

mylist = [5,"g", 3, 43.4]   # ArrayList<String>   ArrayList<Double>  Mixed type  ArrayList<Object>

print(f'{mylist[3]}')

x=[[0,2,0,0],[0,0,3,0],[1,0,0],[1,2,3],[0,0,0],[1,2,3,4]]

for i in range(len(x)):
    for j in range(len(x[i])):
        if x[i][j] != 0:
            break
    if x[i][j] == 0: # check whether it is the row with non-zero element
        print("First all-zero row is", i)
        break
