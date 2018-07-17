import javaobj
import pickle
import logging

marshaller = javaobj.JavaObjectUnmarshaller( open('f.out', 'rb'))
pobj = marshaller.readObject()

def get():
    my_objects = []
    for i in pobj.get_class().fields_names:
        my_objects.append(i)
    for j in my_objects:
        print("--------------")
        print(getattr(pobj, j))

if  __name__ == '__main__':
    get()