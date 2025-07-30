# Java-Framework

## 🚀 Get Started Without Git History

If you want to use this as a clean starter project:

---
> 🧱 Base app with a custom JPanel template
```
JPanel-Focus
```
---
> 🎮 Game loop, FPS counter, Runnable/Thread
``` 
Game-Focus
```
---
> 🧰 Swing components (buttons, sliders, etc.)
``` 
Component-Focus
```

```bash
#!/bin/bash

read -p "Enter GitHub username: " user
read -p "Enter branch to clone (e.g., Game-Focus): " branch
read -p "Enter target folder name: " folder

git clone --branch "$branch" --single-branch "https://github.com/$user/JFrameTemplate.git" "$folder"
cd "$folder" || exit
rm -rf .git   # Remove Git history for a clean start

echo "✅ Project '$folder' cloned from '$user' on branch '$branch'"

```

---

## 🔄 Reinitialize with New Git

You can optionally include this too:

```bash
git init
git add .
git commit -m "Initial commit"
```
> 💡 This repo uses multiple branches as independent templates.
> You do NOT need to create pull requests between them.


---



