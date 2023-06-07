def solution(s):
    words = s.split(" ")
    answer = []
    for word in words:
        a = ""
        for i in range(len(word)):
            if i % 2 == 0:
                a += word[i].upper() 
            else:
                a += word[i].lower()  
        answer.append(a)  
    return " ".join(answer)
