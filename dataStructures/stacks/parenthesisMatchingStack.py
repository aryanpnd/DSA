def match_parentheses(parens):
    s = []
    for c in parens:
        if c == '(' or c == '{' or c == '[':
            s.append(c)
        elif c == ')':
            try:
                t = s.pop()
                if t != '(':
                    return False
            except IndexError:
                return False
        elif c == '}':
            try:
                t = s.pop()
                if t != '{':
                    return False
            except IndexError:
                return False
        elif c == ']':
            try:
                t = s.pop()
                if t != '[':
                    return False
            except IndexError:
                return False
        else:
            return False
    if not s:
        return True
    else:
        return False

print(match_parentheses("((({{{[[[]]]}}})))"))
