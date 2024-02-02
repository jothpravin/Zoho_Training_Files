import streamlit as st
import numpy as np
import matplotlib.pyplot as plt

st.title('Streamlit Example: Line Chart')

# Create a slider for the user to choose the number of data points
num_points = st.slider('Select the number of data points:', 10, 100, 50)

# Generate random data
x = np.linspace(0, 10, num_points)
y = np.sin(x)

# Plot the data
fig, ax = plt.subplots()
ax.plot(x, y)
st.pyplot(fig)

