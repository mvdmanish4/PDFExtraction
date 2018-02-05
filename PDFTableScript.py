import requests
import pandas as pd
import numpy as np
from bs4 import BeautifulSoup

htmlfile = open('one.html', 'w+')
files = {'f': ('one.pdf', open('one.pdf', 'rb'))}
response = requests.post('https://pdftables.com/api?key=l5xepltq4zhs', files=files)
response.raise_for_status() # ensure we notice bad responses
for chunk in response.iter_content(chunk_size=1024):
    if chunk:
        htmlfile.write(chunk)
    htmlfile.flush()
htmlfile.close()