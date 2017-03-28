from datetime import datetime
odds = [1, 3, 5, 7, 9, 11, 13, 17, 19, 21, 23, 25, 27]

right_now_time = datetime.today().minute
if right_now_time in odds:
    print("this minute is odd")
else:
    print("otherwise")
