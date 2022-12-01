import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
df=pd.read_csv("C:/Users/Monisha/Downloads/archive (2)/Cars93.csv")
mode1=df['MPG.city'].mode()
print("Highest frequency : ",mode1)
fig=plt.figure()
x=df["MPG.city"]
plt.title("Frequency distribution")
plt.xlabel("MPG.city")
plt.hist(x, bins=5, edgecolor="black")
