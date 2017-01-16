f=3
b=5
l = 1
I = 1
i = 1
while 1:
    fb=False
    while 1:
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
        if 1:
            print i
            i+=1
            break
    if i>100:
        break
    if not fb:
        print i
        i+=1
