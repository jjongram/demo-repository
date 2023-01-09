babbling = ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]
able = ["aya", "ye", "woo", "ma"]
# print(babbling[0].replace(able[0], ""))
# babbling[0] = babbling[0].replace("aya", "")
for i in range(len(babbling)):
    for j in range(len(able)):
        babbling[i] = babbling[i].replace(able[j], '1')

bool = []
for i in range(len(babbling)):
    bool.append(babbling[i].isdigit())

print(bool.count(True))
