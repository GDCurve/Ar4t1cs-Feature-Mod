co = "{"
cc = "}"
q = "\""
newline = "\n"

# YES I KNOW ITS VERY PRIMITIVE SHUT THE HECC UP LOL

ObjUser = input("""Are you creating an item or block?
> """)
if ObjUser.lower() == "item":
    print("You've specified it to be an item.")
    ObjectType = "item"
elif ObjUser.lower() == "block":
    print("You've specified it to be a block.")
    ObjectType = "block"

Tag = input("""What is the tag of the block or item?
> """)

Name = input("""What is the block called in US English?
>""")

if ObjectType == "block":
    blckstxt = f"{co}{newline}    {q}variants{q}: {co}{newline}     {q}{q}: {co} {q}model{q}: {q}mcmod1:block/{Tag}{q}{cc}{newline}    {cc}{newline}{cc}"
    blockstate = open(f"{Tag}.json", "x")
    blockstate.write(blckstxt)
    blockstate.close()
    input("Put in blockstates and press any key")
    modelblock = open(f"{Tag}.json", "x")
    modeltext = f"{co}{newline}    {q}parent{q}: {q}block/cube_all{q},{newline}    {q}textures{q}: {co}{newline}       {q}all{q}: {q}mcmod1:block/{Tag}{q}{newline}    {cc}{newline}{cc}"
    modelblock.write(modeltext)
    input("put in models.block and press any key")
    modelitem = open(f"{Tag}.json", "x")
    modelitext = f"{co}{newline}    {q}parent{q}: {q}mcmod1:block/{Tag}{q}{newline}{cc}"
    modelitem.write(modelitext)
    input("put in models.item and press any key")
    print("paste in lang")
    print(f'{q}block.mcmod1.{Tag}{q}: {q}{Name}{q}')
