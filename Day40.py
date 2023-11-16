harga_jual_permeter = 300000
luas_tanah = int(input("masukkan luas tanah :"))

harga = harga_jual_permeter * luas_tanah
if harga >= 100000000 :
    pajak = 0.05 * harga
    harga -= pajak
    print("5%")
elif harga >= 50000000:
    pajak1 = 0.03 * harga
    harga -= pajak1
    print("3%")
else:
    print("1%")
print("uang bersih :",harga)
    
    
    
