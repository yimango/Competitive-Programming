#misinterpreted the question, solution takes list of nodes as argument as rather than calling for nodes
#can be adapted by using BFS to traverse tree and constructing a list

def solution(inputTree):
    returnTree = []

    counter = 0
    i = 0
    while counter != len(inputTree):
        tempSet = inputTree[counter : min(2**i + counter, len(inputTree))]
        counter += min(2**i, len(inputTree) - counter)

        while tempSet.count("null") > 0:
            tempSet.remove("null")
        returnTree.append(tempSet)
        i+=1

    return returnTree
