def solution(s):
    s = s.upper()
    p, y = 0, 0
    for i in s:
        if i == 'P':
            p += 1
        elif i == 'Y':
            y += 1
    if p == y:
        return True
    else:
        return False
