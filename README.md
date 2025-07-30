# Java-Framework

## 🚀 Get Started Without Git History

If you want to use this as a clean starter project:

| Branch Name         | Description                                  |
| ------------------- | -------------------------------------------- |
| `main`              | 📄 Only README and instructions              |
| `JPanel-Focus`      | 🧱 Base app with a custom JPanel template    |
| `Game-Focus`        | 🎮 Game loop, FPS counter, Runnable/Thread   |
| `Component-Focus`   | 🧰 Swing components (buttons, sliders, etc.) |


```bash
read -p "Enter the branch you want to clone: " branch
git clone --branch "$branch" --single-branch https://github.com/youruser/JFrameTemplate.git MyApp
cd MyApp
rm -rf .git               # to: remove Git history
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

