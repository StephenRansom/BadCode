f=3
b=5
l = 1
I = 1
i = 1
while True:
    fb=False
    while True:
        if i==f*l:
            print 'fizz'
            fb=True
            l+=1
            i+=1
            break
        if i==b*I:
            print 'buzz'
            fb=True
            I+=1
            i+=1
            break
        break
    if not fb:
        print i
        i+=1
    if i>100:
        break