# Maintenance Monitor

## Introduction
This repository is a simple Spring Boot Web Client created for an assignment.


## Branching Strategy

We follow the [git flow](https://nvie.com/posts/a-successful-git-branching-model/) model with the following conventions, but in a rather basic form:

- The development branch is called `dev`.
- Branch names must be lowercase.
- `${description}`s should be as short as possible while still carrying enough information.
- `${issueId}`s used in branch names must not contain the `#` part.
- Every [feature branch](#feature-branches) is named `feat/{issueId}/{description}`.
  You _can_ use further `/`es in your own description.
- `main` is our **deployment branch**, commits merged to `main` get deployed automatically.

## Feature Branches
You're working on the latest and greatest feature.
Nice!

1. Check out dev and update it
```sh
git checkout dev
git pull
```
2. Create a feature branch
```sh
git checkout -b feat/{isseuId}/{description}
```
3. Implement the feature
4. **Create tests** for the added feature
5. Create a pull request to `dev` and assign a reviewer and somebody that will merge the branch (can be the same person).

## Collaborators
- [Johanna Gaudeck](https://github.com/JohannaGaudeck)
- [Aelfric Mayer](https://github.com/HeroinHeroO)

