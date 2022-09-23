# ImageLingo - Alpha

With our application you can take an image, and our object detection will recognise objects from a list of objects
This object will then be translated 

We plan on using a different model with different objects in our final versions as our target object list is objects
in a classroom.


The tflite model used is the efficientdet/lite0/detection model from TensorFlowHub.

https://tfhub.dev/tensorflow/lite-model/efficientdet/lite0/detection/metadata/1

The tflite model is trained on the COCO 2017 dataset, which consists of the following objects:

## COCO categories: 
person bicycle car motorcycle airplane bus train truck boat traffic light fire hydrant stop sign parking 
meter bench bird cat dog horse sheep cow elephant bear zebra giraffe backpack umbrella handbag tie suitcase 
frisbee skis snowboard sports ball kite baseball bat baseball glove skateboard surfboard tennis racket bottle 
wine glass cup fork knife spoon bowl banana apple sandwich orange broccoli carrot hot dog pizza donut cake chair 
couch potted plant bed dining table toilet tv laptop mouse remote keyboard cell phone microwave oven 
toaster sink refrigerator book clock vase scissors teddy bear hair drier toothbrush

https://cocodataset.org/#explore

# Future versions:
We plan on increasing the amount of objects able to be translated.
We plan on adding more languages.
We plan on adding sentences to be translated with the objects.
We plan on changing the tflite model to one which better suits our classroom setting.
We plan on improving the aesthetic of the app - animation, transitions, colour, layouts.


# How to run the application:
Download the project from Github, and use an Android Emulator to run the application. An IDE such as Android Studio
or  IntelliJ IDEA will work. 


# Group members:
Eliot Luna 
Corey Skvor 
